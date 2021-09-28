const urls = [
    "https://api.openweathermap.org/data/2.5/onecall?lat=39.2953952&lon=16.2536091&lang=it&exclude=minutely&units=metric&appid=777a8a95a8fe7b0637a7daf3a860d216"
]

const root = document.getElementById("root")

const tpl = document.getElementById('listaPersonaggi')

const btnAdd = document.getElementById('personaggiBtn');



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
                cardChar.querySelector('img').setAttribute('src', 'http://openweathermap.org/img/wn/' + dat1.icon + '.png' )
                return root.appendChild(cardChar);
            })

        })
    
    }
    static loadHandler(){
        Card.GetDati()
    }
}

btnAdd.addEventListener('click',Card.loadHandler)
