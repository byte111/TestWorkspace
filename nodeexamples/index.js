const express = require('express');
const app = express();
const http = require('http').Server(app);
const io  = require('socket.io')(http);
const path = require('path');


app.get('/',function(req,res){
     app.use(express.static(path.join(__dirname)));
      res.sendFile(path.join(__dirname, '../nodeexamples', 'start.html'));
});

// Register events on socket connection
io.on('connection', function(socket){
  socket.on('chatMessage', function(from, msg){
    io.emit('chatMessage', from, msg);
  });
  socket.on('notifyUser', function(user){
    io.emit('notifyUser', user);
  });
});

// Listen application request on port 3000
http.listen(3000, function(){
  console.log('listening on *:3000');
});