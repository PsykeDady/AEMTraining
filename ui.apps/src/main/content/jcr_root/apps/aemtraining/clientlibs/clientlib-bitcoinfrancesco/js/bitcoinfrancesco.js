console.log("BitcoinFraAjax");
const bitcoinfrancesco_myString = window.location.pathname
const bitcoinfrancesco_StringtoSplit =  bitcoinfrancesco_myString.split(".")[0]
const bitcoinfrancesco_finalurl=bitcoinfrancesco_StringtoSplit+"/jcr:content/root/container/container/bitcoinfrancesco.json"

console.log("url della pagina: ", bitcoinfrancesco_finalurl)

$(document).ready(function (){
    $.ajax({
        url:bitcoinfrancesco_finalurl,
        dataType: "json",
        success: function(result){
            var htmlTemplate = $("#bitcoinTemplate").html();
            var template = Handlebars.compile(htmlTemplate);
            $("#bitcoinContainer").html(template(result));
            console.log("successo" + result);
        },
        error: function(error){
            console.log("errore" + error);
        }
    });
});