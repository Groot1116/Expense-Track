const { app, BrowserWindow } = require('electron');
const { execFile } = require('child_process');
const path = require('path');

function createWindow() {
  const win = new BrowserWindow({
    width: 800,
    height: 600,
    webPreferences: {
      nodeIntegration: true,
      contextIsolation: false,   // needed for require in renderer process
    }
  });

  win.loadFile(path.join(__dirname, 'index.html'));

  win.webContents.on('did-finish-load', () => {
    const cppPath = path.join(__dirname, '..', 'backend', 'main'); // check this path carefully
    execFile(cppPath, (error, stdout, stderr) => {
      if (error) {
        console.error('Error running C++ binary:', error);
        win.webContents.send('cpp-data', `Error: ${error.message}`);
        return;
      }
      if (stderr) {
        console.error('C++ stderr:', stderr);
      }
      console.log('C++ output:', stdout);
      win.webContents.send('cpp-data', stdout || 'No output from C++ binary');
    });
  });
}

app.whenReady().then(createWindow);
