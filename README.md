# openlearn
This application was generated using JBooter 1.5.3, you can find documentation and help at [https://jbooter.github.io/documentation-archive/v1.5.3](https://jbooter.github.io/documentation-archive/v1.5.3).

This is a "microservice" application intended to be part of a microservice architecture, please refer to the [Doing microservices with JBooter][] page of the documentation for more information.

This application is configured for Service Discovery and Configuration with . On launch, it will refuse to start if it is not able to connect to .

## Development

To start your application in the dev profile, simply run:

    ./mvnw


For further instructions on how to develop with JBooter, have a look at [Using JBooter in development][].

### Using angular-cli

You can also use [Angular CLI][] to generate some custom client code.

For example, the following command:

    ng generate component my-component

will generate few files:

    create src/main/webapp/app/my-component/my-component.component.html
    create src/main/webapp/app/my-component/my-component.component.ts
    update src/main/webapp/app/app.module.ts

## Building for production

To optimize the openlearn application for production, run:

    ./mvnw -Pprod clean package

To ensure everything worked, run:

    java -jar target/*.war


Refer to [Using JBooter in production][] for more details.

## Testing

To launch your application's tests, run:

    ./mvnw clean test
### Other tests

Performance tests are run by [Gatling][] and written in Scala. They're located in [src/test/gatling](src/test/gatling) and can be run with:

    ./mvnw gatling:execute

For more information, refer to the [Running tests page][].

## Using Docker to simplify development (optional)

You can use Docker to improve your JBooter development experience. A number of docker-compose configuration are available in the [src/main/docker](src/main/docker) folder to launch required third party services.
For example, to start a mysql database in a docker container, run:

    docker-compose -f src/main/docker/mysql.yml up -d

To stop it and remove the container, run:

    docker-compose -f src/main/docker/mysql.yml down

You can also fully dockerize your application and all the services that it depends on.
To achieve this, first build a docker image of your app by running:

    ./mvnw package -Pprod docker:build

Then run:

    docker-compose -f src/main/docker/app.yml up -d

For more information refer to [Using Docker and Docker-Compose][], this page also contains information on the docker-compose sub-generator (`jbooter docker-compose`), which is able to generate docker configurations for one or several JBooter applications.

## Continuous Integration (optional)

To configure CI for your project, run the ci-cd sub-generator (`jbooter ci-cd`), this will let you generate configuration files for a number of Continuous Integration systems. Consult the [Setting up Continuous Integration][] page for more information.

[JBooter Homepage and latest documentation]: https://jbooter.github.io
[JBooter 1.5.3 archive]: https://jbooter.github.io/documentation-archive/v1.5.3
[Doing microservices with JBooter]: https://jbooter.github.io/documentation-archive/v1.5.3/microservices-architecture/
[Using JBooter in development]: https://jbooter.github.io/documentation-archive/v1.5.3/development/
[Using Docker and Docker-Compose]: https://jbooter.github.io/documentation-archive/v1.5.3/docker-compose
[Using JBooter in production]: https://jbooter.github.io/documentation-archive/v1.5.3/production/
[Running tests page]: https://jbooter.github.io/documentation-archive/v1.5.3/running-tests/
[Setting up Continuous Integration]: https://jbooter.github.io/documentation-archive/v1.5.3/setting-up-ci/

[Gatling]: http://gatling.io/
