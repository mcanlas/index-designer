package com.htmlism.alexandria

import com.htmlism.alexandria.dynamodb.AttributeName

object AccessPattern:
  case class GetOne(description: String, equalities: List[AttributeName])
  case class GetOneFromSorted(description: String, equalities: List[AttributeName])
  case class GetMany(description: String, equalities: List[AttributeName])
