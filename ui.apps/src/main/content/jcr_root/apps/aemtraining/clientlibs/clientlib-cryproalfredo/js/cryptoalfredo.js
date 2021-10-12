// chiamata ajax jQuery
console.log("cryptoAlfredo ajax richiamamta");

var currentPath = window.location.pathname;
var cleanUrl = currentPath.replace(".html", "/");
console.log("clean url corrente ---->>		", cleanUrl);

$(document).ready(function() {
    $.ajax({

        url: cleanUrl + 'jcr:content/root/container/container/cryptoalfredo.json',
        // ovviamente questo url con javaScript possiamo calcolarlo con una funzione automatica
        dataType: "json",
        success: function(result) {
            var htmlTemplate = $("#cryptoTemplate").html();
            var template = Handlebars.compile(htmlTemplate);
            $("#cryptoContainer").html(template(result)); //imposta il risultato nel conteiner con id 'meteoContainer'
            console.log("risultato =  ", result);
        },
        error: function(error) {
            console.log("errore =  ", error);

        }
    });

    
});