package com.htmlism.alexandria.dynamodb

object Table:
  enum PrimaryKey:
    case Simple(attribute: String)
    case Composite(partitionKey: String, sortKey: String)
    case SyntheticComposite(partitionKey: String, sortKey: String*)
