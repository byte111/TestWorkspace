var express = require('express');
var app = express();
var mongoose = require('mongoose');
var morgan = require('morgan');
var bodyparser = require('body-parser');
var methodoverride = require('method-override');




mongoose.connect('mongodb://localhost:27017/todolist');
app.use(express.static(__dirname));
app.use(morgan('dev'));
app.use(bodyparser.urlencoded({'extended':'true'}));
app.use(bodyparser.json());
app.use(bodyparser.json({ type: 'application/vnd.api+json' })); // parse application/vnd.api+json as json
app.use(methodoverride());


app.listen('3000');
console.log('App listening on port 3000');



var Todo = mongoose.model('Todo',{
text: String
});


app.get('/api/todo',function(req,res){
Todo.find(function(err,todos){
    if(err)
        res.send(err);
    res.json(todos);

});
});

app.post('/api/todo',function(req,res){
Todo.create({
    text : req.body.text,
    done : false

},function(err,todo){

    if(err)
        res.send(err);

     Todo.find(function(err,todo){
        if(err)
            res.send(err);

            res.send(todo);
     });
});
});




app.get('*',function(req,res){
    res.sendfile('./dashboard.html');
});