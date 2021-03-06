(function() {
    'use strict';

    angular
        .module('drApp')
        .controller('DoubleRandomResultDetailController', DoubleRandomResultDetailController);

    DoubleRandomResultDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'entity', 'DoubleRandomResult', 'DoubleRandom', 'Manager'];

    function DoubleRandomResultDetailController($scope, $rootScope, $stateParams, previousState, entity, DoubleRandomResult, DoubleRandom, Manager) {
        var vm = this;

        vm.doubleRandomResult = entity;
        vm.previousState = previousState.name;

        var unsubscribe = $rootScope.$on('drApp:doubleRandomResultUpdate', function(event, result) {
            vm.doubleRandomResult = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
