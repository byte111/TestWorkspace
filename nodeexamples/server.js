console.log("Node is running");
const express = require('express');
const bodyparser = require('body-parser');
const mongoclient = require('mongodb').MongoClient;
const app = express();
app.use(bodyparser.urlencoded({extended:true}));

app.listen(3000,function(){
console.log("listening on port 3000");
});

var db;
 mongoclient.connect('mongodb://localhost:27017/chat',function(err,database){
 if(err)
 return console.log(err);
 db = database;
 //app.listen(3001,function(){
 //console.log("listening on port 3001");
// });

 });

app.get("/",function(request,response){
//response.send("Node says I am happy to server");
//console.log("Node says root path is " + __dirname);
db.collection('quotes').find().toArray(function(error,results){
console.log(results);
});
response.sendFile(__dirname+"/index.html");
});

app.post("/quotes",function(request,response)
{
    db.collection('quotes').save(request.body,function(err,result){

    if(err)
    return console.log(err);
    console.log('saved to database');
    response.redirect('/');

    });



    //db.collection('quotesdata').save({ name: 'jhvj', quote: 'kjbkbk' });
    console.log(request.body);
 });




