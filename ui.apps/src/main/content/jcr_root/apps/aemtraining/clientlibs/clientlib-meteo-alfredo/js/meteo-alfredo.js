// chiamata ajax jQuery
console.log("meteoalfredo ajax richiamamta");
$(document).ready(function() {
    $.ajax({

        url:'/content/aemtraining/us/en/meteoalfredo/jcr:content/root/container/container/meteo_alfredo.json',
        // ovviamente questo url con javaScript possiamo calcolarlo con una funzione automatica
        dataType: "json",
        success: function(result) {
            var htmlTemplate = $("#meteoTemplate").html();
            var template = Handlebars.compile(htmlTemplate);
            $("#meteoContainer").html(template(result)); //imposta il risultato nel conteiner con id 'meteoContainer'
            console.log("risultato =  ", result);
        },
        error: function(error) {
            console.log("errore =  ", error);

        }
    });
});