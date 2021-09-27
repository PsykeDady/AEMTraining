
// Esempio POST
async function getData(url) {
  // Default options are marked with *
  const response = await fetch(url, {
    method: 'GET', 
  //  mode: 'cors', // no-cors, *cors, same-origin
   // cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
  //  credentials: 'same-origin', // include, *same-origin, omit
  });
  return response.json(); // parses JSON response into native JavaScript objects
}

getData('https://api.openweathermap.org/data/2.5/onecall?lat=39.2953&lon=16.2536&exclude=current,minutely,hourly,alerts&units=metric&&appid=fd4a3d5871e3824ca6748d29aa1b25d8')
  .then(data => {
    console.log(data); // JSON data parsed by `data.json()` call
  });
