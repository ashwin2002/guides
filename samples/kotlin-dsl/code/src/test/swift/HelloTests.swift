/*
 * This Swift source file was generated by the Gradle 'init' task.
 */

import XCTest
@testable import BuildingSwiftLibraries

class HelloTests: XCTestCase {
    public static var allTests = [
        ("testGreeting", testGreeting),
    ]

    func testGreeting() {
        XCTAssertEqual("Hello, World!", Greeter().greeting())
    }
}
