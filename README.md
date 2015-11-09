# counters

This is a webservice using JAX-RS and Jersey.

This API provides functions to

Increament a named counter by 1 select a specific counter with current value list of all the counters and their values. to add a counter(optional) Following are the URI's used for the above operations

To increament a specific counter by 1.

PUT: http://{Server}/counters/webapi/counters/{CounterName} Note: If counter name does not exist, it will be added and if name does exist, its counter will be increamented by 1.

To get the list of all counters with current value:

GET: http://{Server}/counters/webapi/counters/

To get a specific counter with current value

GET: http://{Server}/counters/webapi/counters/{CounterName}

To add a new counter

POST: http://{server}/counters/webapi/counters/ Name of the counter must be sent in body of the request as JSON format
