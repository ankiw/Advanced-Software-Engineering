angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    
  

      .state('login', {
    url: '/page1',
    templateUrl: 'templates/login.html',
    controller: 'loginCtrl'
  })

  .state('registrationForm', {
    url: '/page2',
    templateUrl: 'templates/registrationForm.html',
    controller: 'registrationFormCtrl'
  })

  .state('home', {
    url: '/page3',
    templateUrl: 'templates/home.html',
    controller: 'homeCtrl'
  })

$urlRouterProvider.otherwise('/page1')

  

});