console.log("WeatherDavAjax");
var percorsoWeatherDavide = window.location.pathname
percorsoWeatherDavide = percorsoWeatherDavide.split(".")[0]
percorsoWeatherDavide=percorsoWeatherDavide+"/jcr:content/root/container/container/weatherdavide.json"

console.log("percorsoWeatherDavide=",percorsoWeatherDavide);
$(document).ready(function(){
    $.ajax({
        url: percorsoWeatherDavide,
        dataType: "json",
        success: function(result){
            var htmlTemplate = $("#weatherDavideTemplate").html();
            var template = Handlebars.compile(htmlTemplate);
            $("#psyke_meteo_box").html(template(result));
            console.log("successo", result);
        },
        error: function(error){
            console.log("errore", error);
        }
    });
});
