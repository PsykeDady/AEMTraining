console.log("CryptoDavAjax");
var percorsoCryptoTableDavide = window.location.pathname
percorsoCryptoTableDavide = percorsoCryptoTableDavide.split(".")[0]
percorsoCryptoTableDavide=percorsoCryptoTableDavide+"/jcr:content/root/container/container/cryptodavide.json"

console.log("percorsoCryptoTableDavide=",percorsoCryptoTableDavide);
$(document).ready(function(){
    $.ajax({
        url: percorsoCryptoTableDavide,
        dataType: "json",
        success: function(result){
            var htmlTemplate = $("#cryptoTemplate").html();
            var template = Handlebars.compile(htmlTemplate);
            $("#cryptoBody").html(template(result));
            console.log("successo", result);
        },
        error: function(error){
            console.log("errore", error);
        }
    });
});
