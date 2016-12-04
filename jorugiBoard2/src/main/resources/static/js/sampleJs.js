var myApp = angular.module('jorugiBoardApp', []);

myApp.controller('MainCtrl', ['$scope', '$http', function ($scope, $http) {    
    $scope.text = 'Hello, Angular fanatic.';   
    
    $scope.jorugiDataList = [];
    $scope.newId = "";
    $scope.newText = "";

    function getJorugiDataList() {
		var requestUrl = "/api/jorugi";
		var params = null;
    	
	    $http.post(requestUrl, params)
	        .then(function (result) {
	        	console.log(result);
	        	console.log(result.data);
	        	
	        	$scope.jorugiDataList = result.data;
	        	
	        	/*
	            var data = result.data;
	
	            if (data.success === false) {
	                console.log(data);
	
	                var errorMessage = data.message;
	                if (data.messageDetails) {
	                    errorMessage += "\n\n" + data.messageDetails.join("\n");
	                }
	
	                alert(errorMessage);
	                return;
	            }                
	
	            $scope.loginUserCorpName = data.corpName;
	            */
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