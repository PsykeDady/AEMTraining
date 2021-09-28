async function GetDati(){
    const res = await fetch(`https://api.openweathermap.org/data/2.5/onecall?lat=39.2953952&lon=16.2536091&lang=it&exclude=minutely&units=metric&appid=777a8a95a8fe7b0637a7daf3a860d216`,{
        method: 'GET'
    })
    const data = await res.json()
    if (res.status >= 400){
        console.warn("ERROR API");
        throw new Error(data.message);
    }
    console.log(data)
    return data;

}