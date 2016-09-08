/**
 * Created by ankita on 9/7/2016.
 */
angular.module('weather', [])
    .controller('weatherctrl', function($scope, $http) {

        $scope.getWeather = function() {
            $http.get('https://api.wunderground.com/api/81c5ab4040ab0441/conditions/q/MO/Kansas%20City.json').success(function(data) {
                console.log(data);
                temp = data.current_observation.temp_f;
                icon = data.current_observation.icon_url;
                weather = data.current_observation.weather;
                console.log(temp);
                $scope.currentweather = {
                    html: "Currently " + temp + " &deg; F and " + weather + ""
                }
                $scope.currentIcon = {
                    html: "<img src='" + icon + "'/>"
                }

            })
        }

    });
