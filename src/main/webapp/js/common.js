var baseurl = "http://192.168.12.86:9090/vocabulary/";
function getUrlParam(key) {  
    var reg = new RegExp(key + '=([^&]*)');  
    var results = location.href.match(reg);  
    return results ? results[1] : null;  
}