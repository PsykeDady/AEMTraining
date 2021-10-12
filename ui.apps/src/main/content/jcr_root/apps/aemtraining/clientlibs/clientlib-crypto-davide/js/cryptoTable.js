const FIXED_NUM=3;

console.log("CryptoDavAjax");
var percorsoCryptoTableDavide = window.location.pathname
percorsoCryptoTableDavide = percorsoCryptoTableDavide.split(".")[0]
percorsoCryptoTableDavide=percorsoCryptoTableDavide+"/jcr:content/root/container/container/cryptodavide.json"

console.log("percorsoCryptoTableDavide=",percorsoCryptoTableDavide);
$(document).ready(function(){
    Handlebars.registerHelper("formatPrice", function(price) {
        return new Handlebars.SafeString(parseFloat(price).toFixed(FIXED_NUM));
    });

    $.ajax({
        url: percorsoCryptoTableDavide,
        dataType: "json",
        success: function(result){
            var htmlTemplate = $("#cryptoTemplate").html();
            var template = Handlebars.compile(htmlTemplate);
            $("#cryptoBody").html(template(result));
            $(".incrementClass").each(function(index,element){
                console.log("ciao da incrementClass. Elemento:",element);
                let value=element.innerHTML;
                let color=value<0?"--red-value":"--green-value";
                console.log("ciao da incrementClass. Value:",value);
                element.innerHTML=`<span style="color:var(${color})">${value}</span>`;
            });
            $(".convertEuro").each(function(index,element){
                console.log("ciao da convertEuro. Elemento:",element);
                let value=parseFloat(element.innerHTML);
                console.log("ciao da convertEuro. Value:",value);
                element.innerHTML=(value/1.16).toFixed(FIXED_NUM);
            });
            console.log("successo", result);
        },
        error: function(error){
            console.log("errore", error);
        }
    });
});

