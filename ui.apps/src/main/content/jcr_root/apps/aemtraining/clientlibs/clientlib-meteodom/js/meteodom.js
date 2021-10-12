console.log("weaterdomAjax");


// url calcoliamo il path per l'url....
$(document).ready(function(){
    $.ajax({
        url: "/content/aemtraining/us/en/home/jcr:content/root/container/container/meteodom.json",
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
