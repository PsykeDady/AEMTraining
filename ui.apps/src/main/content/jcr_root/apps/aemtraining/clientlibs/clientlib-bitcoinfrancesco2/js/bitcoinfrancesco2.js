console.log("BitcoinFraAjax");
const bitcoinfrancesco2_myString = window.location.pathname
const bitcoinfrancesco2_StringtoSplit =  bitcoinfrancesco2_myString.split(".")[0]
const bitcoinfrancesco2_finalurl=bitcoinfrancesco2_StringtoSplit+"/jcr:content/root/container/container/bitcoinfrancesco2.json"

console.log("url della pagina: ", bitcoinfrancesco2_finalurl)

$(document).ready(function (){
    $.ajax({
        url:bitcoinfrancesco2_finalurl,
        dataType: "json",
        success: function(result){
            var htmlTemplate = $("#bitcoinTemplate2").html();
            var template = Handlebars.compile(htmlTemplate);
            $("#bitcoinContainer2").html(template(result));
            console.log("successo" + result);
        },
        error: function(error){
            console.log("errore" + error);
        }
    });
});