
const urls = [
    "https://api.openweathermap.org/data/2.5/onecall?lat=39.2953952&lon=16.2536091&lang=it&exclude=minutely&units=metric&appid=080edcb7e503a9b8450dfeff30eeec64"
]

const root = document.getElementById("root")

const tpl = document.getElementById('meteoBtn')

const btnAdd = document.getElementById('meteoBtn');

const site = "http://openweathermap.org/img/wn/"

class Card{
    static async GetDati(){
        const [res1] = await Promise.all(urls.map( url =>{
            try {
                return fetch(url).then( response => response.json() )
            } catch (error) {
                // TODO DOPO
                console.error(error)
                throw new Error('pippo')
            }
            
         }))
         console.log(res1)
         console.log(res1.lat)
        res1.hourly.map(dato => {
            const cardChar = document.importNode(tpl.content, true);
            dato.weather.map(dat1=>{

                cardChar.getElementById('test').textContent = 'tempo ' + dat1.description;
                cardChar.querySelector('img').setAttribute('src', 'http://openweathermap.org/img/wn/' + dat1.icon + '.png'  )
                return root.appendChild(cardChar);
            })

        })
    
    }
    static loadHandler(){
        Card.GetDati()
    }
}

btnAdd.addEventListener('click',Card.loadHandler)