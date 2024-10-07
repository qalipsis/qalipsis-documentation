# QALIPSIS

## Introduction

This repository contains the pages for the documentation of QALIPSIS.
The documentation website is build by [Antora](https://antora.org/) in a [dedicated repository](https://github.com/qalipsis/documentation-build.git).

## How to add a new page

Just add a new ASCIIDOC file in the dedicated folder - or create a new one.
References between files should always use the cross-reference syntax, based upon the ROOT folder, e.g.

```
xref:specifications/steps.adoc[Steps specifications]
```

To add an entry into the menu, add the cross-reference to the file `nav.doc`. When no title is specified in the link,
the first heading will be used as link text.

```
xref:installation/overview.adoc[]
```