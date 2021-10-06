console.log("WeatherDavAjax");
$(document).ready(function(){
    $.ajax({
        url: `jcr:weatherDavide.json`,
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
