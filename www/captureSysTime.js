var cordova = require('cordova');

var captureSysTime = {

	"get" : function(onSuccessFn, onErrorFn){
		cordova.exec(onSuccessFn, onErrorFn, 'CaptureSysTimePlugin', 'get', []); 
	}

};

module.exports = captureSysTime;

