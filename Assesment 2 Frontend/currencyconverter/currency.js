
const from_currencyEl = document.getElementById('from_currency');  //calling method which returns reference to the first obj with specified id
const from_ammountEl = document.getElementById('from_ammount');     //calling method which returns reference to the first obj with specified id
const to_currencyEl = document.getElementById('to_currency');      //calling method which returns reference to the first obj with specified id
const to_ammountEl = document.getElementById('to_ammount');         //calling method which returns reference to the first obj with specified id
const rateEl = document.getElementById('rate');
const exchange = document.getElementById('exchange');
 
from_currencyEl.addEventListener('change', calculate); //Appends an event listener for events whose type attribute value is type 
from_ammountEl.addEventListener('input', calculate);
to_currencyEl.addEventListener('change', calculate);
to_ammountEl.addEventListener('input', calculate);
 
exchange.addEventListener('click', () => {
	const temp = from_currencyEl.value;
	from_currencyEl.value = to_currencyEl.value;
	to_currencyEl.value = temp;
	calculate();                                                 //function
});
 
function calculate() {
	const from_currency = from_currencyEl.value;
	const to_currency = to_currencyEl.value;
	
	fetch(`https://api.exchangerate-api.com/v4/latest/${from_currency}`)    //fetch readymade api
		.then(res => res.json())
		.then(res => {
		const rate = res.rates[to_currency];
		rateEl.innerText = `1 ${from_currency} = ${rate} ${to_currency}`
		to_ammountEl.value = (from_ammountEl.value * rate).toFixed(2);
	})
}
 
calculate();