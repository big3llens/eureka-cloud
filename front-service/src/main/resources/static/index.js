(function (){
    'use strict';

    angular.module('app', []).config(config()).run(run);

    function config($httpProvider){}
    function run(){}
})();

angular.module('app', []).controller('indexController', function ($scope, $http) {
    // console.log(123321);
    $scope.getProducts = function () {
        $http({
            url: 'http://localhost:5555/cloud/api/v1/products/',
            // url: 'http://localhost:58211/',
            method: 'GET'
        }).then(function (response) {
            $scope.ProductsList = response.data;
        });
    };

    $scope.getProducts();
});