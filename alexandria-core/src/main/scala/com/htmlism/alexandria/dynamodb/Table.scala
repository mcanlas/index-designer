package com.htmlism.alexandria.dynamodb

object Table:
  enum PrimaryKey:
    case Simple(attribute: AttributeName)
    case Composite(partitionKey: AttributeName, sortKey: AttributeName)
    case SyntheticComposite(
        partitionKey: AttributeName,
        delimiter: String,
        first: AttributeName,
        second: AttributeName,
        xs: AttributeName*
    )
