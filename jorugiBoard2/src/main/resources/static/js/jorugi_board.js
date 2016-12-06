var myApp = angular.module('jorugiBoardApp', []);

myApp.controller('MainCtrl', ['$scope', '$http', function ($scope, $http) {  
	
    $scope.text = 'Jorugi Board';   
    
    $scope.jorugiDataList = [];
    $scope.newId = "";
    $scope.newText = "";
    
    //게시판 처음 전체 조회
    function getJorugiDataList() {
		var requestUrl = "/api/getJorugiBoardList";
		var params = null;
    	
	    $http.post(requestUrl, params)
	        .then(function (result) {
	        	console.log(result);
	        	console.log(result.data);
	        	
	        	$scope.jorugiDataList = result.data;
	        	
	        	
	            var data = result.data;

	        });
    }
    
    $scope.addNewJorugi = function() {
		var requestUrl = "/api/insertJorugiData";
		var params = {
				id: $scope.newId,
				text: $scope.newText
		};
    	
    	$http.post(requestUrl, params)
	        .then(function (result) {	        	
	        	alert(result.data.message);
	        	
	        	getJorugiDataList();
	        });
    };

    // ---- init code ----
	getJorugiDataList();
	
}]);