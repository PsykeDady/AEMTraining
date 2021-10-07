// chiamata ajax jQuery
console.log("meteoalfredo ajax richiamamta");

// chiamata ajax jQuery
console.log("meteoalfredo ajax richiamamta");

var currentPath = window.location.pathname;
var cleanUrl = currentPath.replace(".html", "/");
console.log("clean url corrente ---->>		", cleanUrl);

$(document).ready(function() {
    $.ajax({

        url: '/content/aemtraining/us/en/meteoalfredo/jcr:content/root/container/container/meteo_alfredo.json',
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

    // condition custom per Handlebars
    Handlebars.registerHelper('ifCond', function(v1, operator, v2, options) {

        switch (operator) {
            case '==':
                return (v1 == v2) ? options.fn(this) : options.inverse(this);
            case '===':
                return (v1 === v2) ? options.fn(this) : options.inverse(this);
            case '!=':
                return (v1 != v2) ? options.fn(this) : options.inverse(this);
            case '!==':
                return (v1 !== v2) ? options.fn(this) : options.inverse(this);
            case '<':
                return (v1 < v2) ? options.fn(this) : options.inverse(this);
            case '<=':
                return (v1 <= v2) ? options.fn(this) : options.inverse(this);
            case '>':
                return (v1 > v2) ? options.fn(this) : options.inverse(this);
            case '>=':
                return (v1 >= v2) ? options.fn(this) : options.inverse(this);
            case '&&':
                return (v1 && v2) ? options.fn(this) : options.inverse(this);
            case '||':
                return (v1 || v2) ? options.fn(this) : options.inverse(this);
            default:
                return options.inverse(this);
        }
    });
});