Body-parser API for Scala.js
================================
This is a Scala.js type-safe binding for [body-parser](https://www.npmjs.com/package/body-parser)

Node.js body parsing middleware.

#### Build Dependencies

* [ScalaJs.io v0.3.x](https://github.com/ldaniels528/scalajs.io)
* [SBT v0.13.13](http://www.scala-sbt.org/download.html)

#### Build/publish the SDK locally

```bash
 $ sbt clean publish-local
```

#### Running the tests

Before running the tests the first time, you must ensure the npm packages are installed:

```bash
$ npm install
```

Then you can run the tests:

```bash
$ sbt test
```

#### Examples

```scala
import io.scalajs.npm.bodyparser._
import io.scalajs.npm.express.Express

val app = Express()

// parse application/x-www-form-urlencoded 
app.use(BodyParser.urlencoded(new UrlEncodedBodyOptions(extended = false)))

// parse application/json 
app.use(BodyParser.json())
```

#### Artifacts and Resolvers

To add the `BodyParser` binding to your project, add the following to your build.sbt:  

```sbt
libraryDependencies += "io.scalajs.npm" %%% "body-parser" % "1.16.0"
```

Optionally, you may add the Sonatype Repository resolver:

```sbt   
resolvers += Resolver.sonatypeRepo("releases") 
```