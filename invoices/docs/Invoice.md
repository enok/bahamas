

# Invoice

Business object that represents an Invoice.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id auto-generated for a Client. |  [optional] [readonly]
**status** | **String** | Represents the Invoice current status. |  [optional] [readonly]
**archived** | **Boolean** | If the Invoice was archived. |  [optional] [readonly]
**type** | **String** | The type of document created. |  [optional] [readonly]
**date** | **LocalDate** | The invoice date. Must be in format dd/mm/yyyy ex.: 03/12/2015. If format is invalid, date will be set to current date. | 
**dueDate** | **LocalDate** | The invoice due date. Must be in format dd/mm/yyyy ex.: 03/12/2015. If format is invalid, date will be set to current date. | 
**reference** | **String** | The invoice purchase order reference field. |  [optional]
**observations** | **String** | Invoice observations, these will be printed with the invoice. |  [optional]
**retention** | **Integer** | Withholding tax percentage (%). Must be a number between 0 and 99.99. |  [optional]
**permalink** | **String** | Permalink. |  [optional] [readonly]
**sum** | **Double** | Sum of totals of all itens. |  [optional] [readonly]
**discount** | **Double** | Sum of discounts of all itens. |  [optional]
**beforeTaxes** | **Double** | Sum before taxes. |  [optional] [readonly]
**taxes** | **Double** | Sum of taxes of all itens. |  [optional] [readonly]
**total** | **Double** | Total sum with total taxes. |  [optional] [readonly]
**taxExemption** | **String** | Portuguese IVA exemption code. Required for portuguese accounts on invoices with IVA exempt items (0%). Refer to the Appendix for the complete list of “IVA Exemption Codes”. |  [optional]
**sequenceNumber** | **String** | Sequence number. |  [optional] [readonly]
**sequenceId** | **String** | Id of the sequence you want to use with this invoice. If missing, the default sequence will be used. |  [optional]
**manualSequenceNumber** | **String** | Required for non portuguese accounts with manual sequence numbering. |  [optional]
**client** | [**Client**](Client.md) |  | 
**items** | [**List&lt;Item&gt;**](Item.md) | An array of invoice items. If items with the given names do not exist, they are created. If an item already exists, it is updated with the new values. At least one is required. | 
**mbReference** | **String** | Generates a Multibanco Reference after you finalize your invoice. This option is only available for Portuguese Accounts. You must have the feature enabled on your account first. |  [optional]
**ownerInvoiceId** | **Integer** | The (owner) invoice associated to this document. This option is only available for credit_notes or debit_notes. You can also send the (owner) guide id when creating an invoice to associate an invoice to a guide. |  [optional]
**taxExemptionReason** | **String** | Used when updating a document and removing all tax exempt items. The code M00 means &#39;Without tax exemption&#39;. |  [optional]
**currencyCode** | **String** | If your plan as multicurrency, you can issue invoices in another currency than your account&#39;s default currency. The currency_code should be one of the following ISO 4217 currency codes. |  [optional]
**currency** | **String** |  |  [optional] [readonly]
**rate** | **Double** | When sending a currency_code you can specify its&#39; rate. |  [optional]



