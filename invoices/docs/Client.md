

# Client

Business object that represents a Client.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id auto-generated for a Client |  [optional] [readonly]
**name** | **String** | Client name, normally used for a company name. | 
**code** | **String** | Client code, your specific code for the client. | 
**email** | **String** | Client email address. Must be a valid email address ex: foo@bar.com |  [optional]
**language** | **String** | Client language. May be en, pt or es; defaults to the account language. |  [optional]
**address** | **String** | Client company address. |  [optional]
**city** | **String** | Client’s city. |  [optional]
**postalCode** | **String** | Client’s postal code for it’s company address. |  [optional]
**country** | **String** | Country, normally used for a company country. Although country is optional, when supplied, it should match one of the country list on the Appendix of this Documentation. |  [optional]
**fiscalId** | **String** | The client fiscal ID (Número de Contribuinte). |  [optional]
**website** | **String** | The client web address. |  [optional]
**phone** | **String** | The client phone number. |  [optional]
**fax** | **String** | The client fax number. |  [optional]
**preferredContact** | [**PreferredContact**](PreferredContact.md) |  |  [optional]
**observations** | **String** | Default observations for the client, the text in here will be added to the observations field of all the invoices sent to this client. |  [optional]
**sendOptions** | **Integer** | Send options for the client. Available options are: 1 - send only the original document / 2 – the original and duplicate / 3 – the original, duplicate and triplicate. These affect the generated pdf. |  [optional]



