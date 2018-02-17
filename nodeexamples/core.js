var devtodo = angular.module('mytodo',[]);
function mainController($scope,$http)
{
    $scope.formData={};
    $http.get('/api/todo')
        .success(function(data){
            $scope.todo = data ;
        })
        .error(function(data){
            console.log('Error : ' + data);
        });


        $scope.createTodo = function() {
                $http.post('/api/todos', $scope.formData)
                    .success(function(data) {
                        $scope.formData = {}; // clear the form so our user is ready to enter another
                        $scope.todos = data;
                        console.log(data);
                    })
                    .error(function(data) {
                        console.log('Error: ' + data);
                    });
            };
}


