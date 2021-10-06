console.log("WeatherFraAjax");
const myString = window.location.pathname
const StringtoSplit = myString.split(".")[0]
const finalurl=StringtoSplit+"/jcr:content/root/container/container/weatherfrancesco.json"

console.log("url della pagina e'=",finalurl)

$(document).ready(function(){
    $.ajax({
        url:finalurl ,
        dataType: "json",
        success: function(result){
            var htmlTemplate = $("#weatherTemplate").html();
            var template = Handlebars.compile(htmlTemplate);
            $("#weatherContainer").html(template(result));
            console.log("successo" + result);
        },
        error: function(error){
            console.log("errore" + error);
        }
    });
});
