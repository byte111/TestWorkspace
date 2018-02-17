var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var methodOverride = require('method-override');
var mongoose = require('mongoose');


mongoose.connect('mongodb://localhost:27017/stencil-dev');

var port = 3001;

app.use(bodyParser.json());
app.use(bodyParser.json({type : 'application/vnd.api+json'}));
app.use(bodyParser.urlencoded({ extended: true }));
app.use(methodOverride('X-HTTP-Method-Override'));
app.use(express.static(__dirname + '/public'));
require('./app/routes')(app);
app.listen(port);
console.log('Magic happens on port ' + port);
exports = module.exports = app;