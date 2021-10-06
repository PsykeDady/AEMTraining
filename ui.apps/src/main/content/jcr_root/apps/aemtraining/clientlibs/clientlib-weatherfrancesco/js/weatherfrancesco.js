console.log("WeatherFraAjax");

$(document).ready(function(){
    $.ajax({
        url: `/content/aemtraining/us/en/bianca/jcr:content/root/container/container/weatherfrancesco.json`,
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
