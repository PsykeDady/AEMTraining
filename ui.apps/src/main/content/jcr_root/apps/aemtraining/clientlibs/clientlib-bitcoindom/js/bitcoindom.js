const bitcoindom_myString = window.location.pathname
const bitcoindom_StringtoSplit =  bitcoindom_myString.split(".")[0]
const bitcoindom_finalurl=bitcoindom_StringtoSplit+"/jcr:content/root/container/container/bitcoindom.json"

console.log("url della pagina: ", bitcoindom_finalurl)

$(document).ready(function (){
    $.ajax({
        url:bitcoindom_finalurl,
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