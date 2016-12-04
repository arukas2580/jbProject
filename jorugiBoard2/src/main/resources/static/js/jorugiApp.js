var myApp = angular.module('jorugiApp', []);

myApp.controller('MainCtrl', ['$scope', '$http', function ($scope, $http) {   
    $scope.text = 'Hello, Jorugi World!!';   

    $scope.moveJorugiBoard = function() {
    	location.href = "/api/moveJorugiBoard";
    };
}]);