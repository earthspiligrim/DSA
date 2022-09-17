/**
 * @param {string[]} logs
 * @return {number}
 */
 var minOperations = function(logs) {
    let result = 0;
    for(let log of logs) {
        if(log === "../"){
            if(result>0) result -=1;
        } 
        else if(log === "./") result +=0;
        else {  
            result +=1;
          }
    }  
    return result;682. Baseball Game
};
