angular.module('app.services', [])

.factory('UserService',function($filter,$q,$window){
        var service = {};


        service.GetByUsername = GetByUsername;
        service.CreateUser = CreateUser;
        service.CheckLoginCredentials = CheckLoginCredentials;
        service.GetUserCredentials = GetUserCredentials;

        return service;
        function GetUserCredentials(data){
            var deferred = $q.defer();
            var filtered = $filter('filter')(getUsers(), { uname: data.uname },{ pwd: data.pwd });
            var user = filtered.length ? filtered[0] : null;
            deferred.resolve(user);
            return deferred.promise;
        }
        function CheckLoginCredentials(data){
            var deferred = $q.defer();
            GetUserCredentials(data)
                .then(function (duplicateUser) {
                    if (duplicateUser !== null) {
                        deferred.resolve({ success: true });
                    } else {
                        deferred.resolve({ success: false, message: 'Invalid Credentails '});
                    }
                });
            return deferred.promise;
        }
        function CreateUser(data){
            var deferred = $q.defer();
            GetByUsername(data.uname)
                .then(function (duplicateUser) {
                    if (duplicateUser !== null) {
                        deferred.resolve({ success: false, message: 'Username "' + data.uname + '" is already taken' });
                    } else {
                        var users = getUsers();
                        users.push(data);
                        setUsers(users);
                        deferred.resolve({ success: true });
                    }
                });
            return deferred.promise;
        };
        function GetByUsername(uname) {
            var deferred = $q.defer();
            var filtered = $filter('filter')(getUsers(), { Username:uname });
            var user = filtered.length ? filtered[0] : null;
            deferred.resolve(user);
            return deferred.promise;
        };
        function getUsers(){
            if(!localStorage.users){
                localStorage.users = JSON.stringify([]);
            }
            return JSON.parse(localStorage.users);
        };
        function setUsers(users){
            localStorage.users = JSON.stringify(users);
        };
    })


.service('BlankService', [function(){

}]);

