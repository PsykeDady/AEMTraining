console.log("CryptoDavAjax");
var percorso = window.location.pathname
percorso = percorso.split(".")[0]
percorso=percorso+"/jcr:content/root/container/container/cryptodavide.json"

console.log("percorso=",percorso);
$(document).ready(function(){
    $.ajax({
        url: percorso,
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
