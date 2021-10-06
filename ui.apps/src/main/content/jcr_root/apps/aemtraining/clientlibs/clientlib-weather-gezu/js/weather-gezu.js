
console.log("weather_gezu");

// url will be calculated automatically
$(document).ready(function(){
    $.ajax({
      url: '/content/aemtraining/us/en/weather/jcr:content/root/container/container/weather_gezu.json',
      dataType: "json",
      success: function(result){
        var htmlTemplate = $("#weatherTemplate").html();
        var template = Handlebars.compile(htmlTemplate);
        $("#weatherContainer").html(template(result));
        console.log("success" + result);
      },
      error: function(error){
         console.log("error" + error)
      }
    });
});

