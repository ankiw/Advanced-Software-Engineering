var animateApp = angular.module('animateApp', ['ngRoute', 'ngAnimate']);

animateApp.config(function($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'Login_Page.html',
            controller: 'mainController'
        })
        .when('/register', {
            templateUrl: 'Register_Page.html',
            controller: 'registerController'
        })
        .when('/GoogleServices', {
            templateUrl: 'Home_Page.html',
            controller: 'weatherController'
        });

});

animateApp.controller('mainController', function($scope) {
    $scope.pageClass = 'Login';
});

animateApp.controller('registerController', function($scope) {
    $scope.pageClass = 'Register';
});

animateApp.controller('googleServiceController', function($scope) {
    $scope.pageClass = 'Home';
});

var AddressBook = angular.module('AddressBook', []);

AddressBook.controller('PersonController', function ($scope) {

});

var AddressBook = angular.module('AddressBook', []);

AddressBook.controller('PersonController', function ($scope) {

});
