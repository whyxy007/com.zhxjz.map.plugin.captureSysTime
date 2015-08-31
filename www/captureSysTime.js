var cordova = require('cordova');

var captureSysTimePlugin = {

	"getSysTime" : function(onSuccessFn, onErrorFn){
		cordova.exec(onSuccessFn, onErrorFn, 'CaptureSysTimePlugin', 'getSysTime', []); 
	}

};

module.exports = captureSysTimePlugin;

