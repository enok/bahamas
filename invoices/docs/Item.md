

# Item

Invoice item.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the item. Must be unique. | 
**description** | **String** | Item’s description. | 
**unitPrice** | **Double** | Item’s unit price. Must be a number equal or greater than 0.0. | 
**quantity** | **Integer** | Quantity. Must be a number equal or greater than 0. | 
**unit** | **String** | The item unit of measure. |  [optional]
**discount** | **Double** | The item discount percentage(%). Defaults to 0.0. Must be a value between 0.0 and 100.0 inclusive. |  [optional]
**tax** | [**Tax**](Tax.md) |  |  [optional]
**discountAmount** | **Double** |  |  [optional] [readonly]
**subtotal** | **Double** |  |  [optional] [readonly]
**taxAmount** | **Double** |  |  [optional] [readonly]
**total** | **Double** |  |  [optional] [readonly]



