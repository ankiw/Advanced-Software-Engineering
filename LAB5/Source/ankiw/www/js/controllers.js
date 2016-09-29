angular.module('app.controllers', [])
  

.controller('loginCtrl', function($scope, $stateParams,UserService,$state){ 
    
    
     $scope.data={
        uname:'',
        pwd:''
    }


    $scope.login=function(){
        
        console.log("inside login"+$scope.data.uname+$scope.data.pwd);
         UserService.CheckLoginCredentials($scope.data)
                .then(function (response) {
                    if (response.success) {
                        
                       $state.go("homePage");
                    }
                    else{
                        console.log("Invalid Credentials");
                    }
                });
        
      
    }
                          
})
   
.controller('registrationFormCtrl', function($scope, $stateParams,UserService,$state ){
           
    $scope.data={
        uname:'',
        pwd:''
        
    }
           $scope.register=function(){
        $scope.RegSubmitted=true;
        $scope.IsRegLogedIn=true;
               
               console.log($scope.data.uname+$scope.data.pwd);
            
                    UserService.CreateUser($scope.data)
            .then(function (response) {
                if (response.success) {
                   
                                     console.log("success");
                }
                else{
                    console.log("fail");
                }
            });
     
           }
                                     
       })


.controller('RedditCtrl', function($http, $scope){
   
    $scope.stories = [];
    function loadStories(params, callback){
        $http.get('https://www.reddit.com/r/television/new/.json', {params: params})
        .success(function(response){
        var stories = [];
        angular.forEach(response.data.children, function(child){
            stories.push(child.data);
        });
        callback(stories);
    });
    }
    
    $scope.loadOlderStories = function(){
        var params = {};
        if($scope.stories.length > 0){
            params['after'] = $scope.stories[$scope.stories.length - 1].name;
        }
        loadStories(params, function(olderStories){
           $scope.stories = $scope.stories.concat(olderStories);
           $scope.$broadcast('scroll.infiniteScrollComplete');
        }); 
  };
    $scope.loadNewerStories = function(){
        var params = {'before': $scope.stories[0].name};
        loadStories(params, function(newrStories){
        $scope.stories = newerStories.concat($scope.stories);
        $scope.$broadcast('scroll.refreshComplete');
        });
    };
});

.controller('AccountCtrl', function($scope, $ionicLoading) {
console.log("AccountCtrl");
$scope.initialise = function() {
console.log("In Google.maps.event.addDomListener");
var myLatlng = new google.maps.LatLng(37.3000, -120.4833);
var mapOptions = {
center: myLatlng,
zoom: 16,
mapTypeId: google.maps.MapTypeId.ROADMAP
};


    console.log(mapOptions);
    var map = new google.maps.Map(document.getElementById("map"), mapOptions);

    navigator.geolocation.getCurrentPosition(function(pos) {
        console.log(pos);
        map.setCenter(new google.maps.LatLng(pos.coords.latitude, pos.coords.longitude));
        var myLocation = new google.maps.Marker({
            position: new google.maps.LatLng(pos.coords.latitude, pos.coords.longitude),
            map: map,
            title: "My Location"
        });
    });

    $scope.map = map;
};
google.maps.event.addDomListener(document.getElementById("map"), 'load', $scope.initialise());

