import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import { Square, Triangle, Circle, QuarterCircle, Rectangle } from './Components/Figures'


/*<Square
    size={"200"}
    mt={"0"}
    marginTop={0}
    width={200}
    height={200}
    backgroundColor={"red"}
/>*/


export default function App() {
    return (
        /* Ejercicio 2
        <View style= {{alignItems: "center"}}>
            <Square
                size={"100"}
                mt={"0"}
                marginTop={200}
                width={100}
                height={100}
                backgroundColor={"blue"}
            />
            <Square
                size={"200"}
                mt={"0"}
                marginTop={0}
                width={200}
                height={200}
                backgroundColor={"red"}
            />
        </View>*/
        /* Ejercicio 3
        <View style= {{alignItems: "center"}}>
            <Rectangle
                size = {"200"}
                mt = {"0"}
                marginTop = {200}
                width={200}
                height={100}
                backgroundColor = {"blue"}
            />
            <View style= {{alignItems: "center", flexDirection: "row"}}>
            <Square
                size={"100"}
                mt={"0"}
                marginTop={0}
                width={100}
                height={100}
                backgroundColor={"blue"}
            />
            <Square
                size={"100"}
                mt={"0"}
                marginTop={0}
                width={100}
                height={100}
                backgroundColor={"red"}
            />
            </View>
            <Rectangle
                size = {"200"}
                mt = {"0"}
                marginTop = {0}
                width={200}
                height={100}
                backgroundColor = {"red"}
            />
        </View>*/
        /* Ejercicio 4
        <View style={{ alignItems: "center" }}>
            <Triangle
                size={"200"}
                mt={"-2"}
                marginTop={200}
                width={0}
                height={0}
                backgroundColor={"blue"}
                borderLeftWidth={50}
                borderRightWidth={50}
                borderBottomWidth={100}
                borderLeftColor={"transparent"}
                borderRightColor={"transparent"}
                borderBottomColor={"red"}

            />
            <Square
                size={"100"}
                mt={"0"}
                marginTop={0}
                width={100}
                height={100}
                backgroundColor={"blue"}
            />

            <Rectangle
                size={"200"}
                mt={"0"}
                marginTop={0}
                width={200}
                height={100}
                backgroundColor={"blue"}
            />
        </View>*/

        /* Ejercicio 5
        <View style={{ alignItems: "center", flexDirection: "column"}}>
            <View style={{ alignItems: "center", flexDirection: "row"}}>
            
            <Square
                size={"100"}
                mt={"0"}
                marginTop={0}
                width={100}
                height={100}
                backgroundColor={"transparent"}
            />

            <Triangle
                size={"200"}
                mt={"-2"}
                marginTop={200}
                width={0}
                height={0}
                backgroundColor={"transparent"}
                borderLeftWidth={50}
                borderRightWidth={50}
                borderBottomWidth={100}
                borderLeftColor={"transparent"}
                borderRightColor={"transparent"}
                borderBottomColor={"red"}
            />
            
            <Square
                size={"100"}
                mt={"0"}
                marginTop={0}
                width={100}
                height={100}
                backgroundColor={"transparent"}
            />
            </View>


            <View style={{ flexDirection: "row"}}>
                <View style = {{ transform: 'rotate(270deg)' }}>
                <Triangle
                    size={"200"}
                    mt={"-2"}
                    marginTop={0}
                    width={0}
                    height={0}
                    backgroundColor={"transparent"}
                    borderLeftWidth={50}
                    borderRightWidth={50}
                    borderBottomWidth={100}
                    borderLeftColor={"transparent"}
                    borderRightColor={"transparent"}
                    borderBottomColor={"red"}
                />
                </View>
                <Square
                    size={"100"}
                    mt={"0"}
                    marginTop={0}
                    width={100}
                    height={100}
                    backgroundColor={"blue"}
                />
                <View style = {{ transform: 'rotate(90deg)' }}>
                <Triangle
                    size={"200"}
                    mt={"-2"}
                    marginTop={0}
                    width={0}
                    height={0}
                    backgroundColor={"transparent"}
                    borderLeftWidth={50}
                    borderRightWidth={50}
                    borderBottomWidth={100}
                    borderLeftColor={"transparent"}
                    borderRightColor={"transparent"}
                    borderBottomColor={"red"}
                />
                </View>
                

            </View>
            <View style={{ alignItems: "center", flexDirection: "row"}}>
            
            <Square
                size={"100"}
                mt={"0"}
                marginTop={0}
                width={100}
                height={100}
                backgroundColor={"transparent"}
            />
            
            <View style = {{transform: 'rotate(180deg)'}}>
            <Triangle
                size={"200"}
                mt={"-2"}
                marginTop={0}
                width={0}
                height={0}
                backgroundColor={"transparent"}
                borderLeftWidth={50}
                borderRightWidth={50}
                borderBottomWidth={100}
                borderLeftColor={"transparent"}
                borderRightColor={"transparent"}
                borderBottomColor={"red"}
            />
            </View>
            
            <Square
                size={"100"}
                mt={"0"}
                marginTop={0}
                width={100}
                height={100}
                backgroundColor={"transparent"}
            />
            </View>
        </View>*/

        /* Extra TriFuerza
        <View style={{ alignItems: "center", flexDirection: "column" }}>
            <View style={{ flexDirection: "row" }}>

                <Triangle
                    size={"200"}
                    mt={"-2"}
                    marginTop={200}
                    width={0}
                    height={0}
                    backgroundColor={"transparent"}
                    borderLeftWidth={50}
                    borderRightWidth={50}
                    borderBottomWidth={100}
                    borderLeftColor={"transparent"}
                    borderRightColor={"transparent"}
                    borderBottomColor={"transparent"}
                />

                <Triangle
                    size={"200"}
                    mt={"-2"}
                    marginTop={200}
                    width={0}
                    height={0}
                    backgroundColor={"transparent"}
                    borderLeftWidth={50}
                    borderRightWidth={50}
                    borderBottomWidth={100}
                    borderLeftColor={"transparent"}
                    borderRightColor={"transparent"}
                    borderBottomColor={"gold"}
                />

                <Triangle
                    size={"200"}
                    mt={"-2"}
                    marginTop={200}
                    width={0}
                    height={0}
                    backgroundColor={"transparent"}
                    borderLeftWidth={50}
                    borderRightWidth={50}
                    borderBottomWidth={100}
                    borderLeftColor={"transparent"}
                    borderRightColor={"transparent"}
                    borderBottomColor={"transparent"}
                />
            </View>

            <View style={{ flexDirection: "row" }}>

                <Triangle
                    size={"200"}
                    mt={"-2"}
                    marginTop={0}
                    width={0}
                    height={0}
                    backgroundColor={"transparent"}
                    borderLeftWidth={50}
                    borderRightWidth={50}
                    borderBottomWidth={100}
                    borderLeftColor={"transparent"}
                    borderRightColor={"transparent"}
                    borderBottomColor={"gold"}
                />

                <Triangle
                    size={"200"}
                    mt={"-2"}
                    marginTop={0}
                    width={0}
                    height={0}
                    backgroundColor={"transparent"}
                    borderLeftWidth={1}
                    borderRightWidth={1}
                    borderBottomWidth={50}
                    borderLeftColor={"transparent"}
                    borderRightColor={"transparent"}
                    borderBottomColor={"transparent"}
                />

                <Triangle
                    size={"200"}
                    mt={"-2"}
                    marginTop={0}
                    width={0}
                    height={0}
                    backgroundColor={"transparent"}
                    borderLeftWidth={50}
                    borderRightWidth={50}
                    borderBottomWidth={100}
                    borderLeftColor={"transparent"}
                    borderRightColor={"transparent"}
                    borderBottomColor={"gold"}
                />
            </View>

        </View>
        */

        /* Ejercicio 6
        <View style={{ alignItems: "center", flexDirection: "column" }}>
            <View style={{ alignItems: "center", flexDirection: "row" }}>
            
            <Circle
                size="100" mt="-2" marginTop={200}
                width={100}
                height={100}
                borderRadius={100 / 2}
                backgroundColor={"red"}
            />
            <Circle
                size="100" mt="-2" marginTop={200}
                width={100}
                height={100}
                borderRadius={100 / 2}
                backgroundColor={"red"}
            />
            <Circle
                size="100" mt="-2" marginTop={200}
                width={100}
                height={100}
                borderRadius={100 / 2}
                backgroundColor={"red"}
            />
            </View>

            <View style={{ alignItems: "center", flexDirection: "row" }}>
            
            <Circle
                size="100" mt="-2" marginTop={0}
                width={100}
                height={100}
                borderRadius={100 / 2}
                backgroundColor={"red"}
            />
            <Circle
                size="100" mt="-2" marginTop={0}
                width={100}
                height={100}
                borderRadius={100 / 2}
                backgroundColor={"blue"}
            />
            <Circle
                size="100" mt="-2" marginTop={0}
                width={100}
                height={100}
                borderRadius={100 / 2}
                backgroundColor={"red"}
            />
            </View>
            <View style={{ alignItems: "center", flexDirection: "row" }}>
            
            <Circle
                size="100" mt="-2" marginTop={0}
                width={100}
                height={100}
                borderRadius={100 / 2}
                backgroundColor={"red"}
            />
            <Circle
                size="100" mt="-2" marginTop={0}
                width={100}
                height={100}
                borderRadius={100 / 2}
                backgroundColor={"red"}
            />
            <Circle
                size="100" mt="-2" marginTop={0}
                width={100}
                height={100}
                borderRadius={100 / 2}
                backgroundColor={"red"}
            />
            </View>
        </View>*/


        <View style={{ alignItems: "center", flexDirection: "column" }}>

            <View style={{ flexDirection: "row" }}>
                <QuarterCircle
                    size="100" mt="-2" marginTop={0}
                    width={100}
                    height={100}
                    borderTopLeftRadius={150}
                    borderTopRightRadius={0}
                    borderBottomLeftRadius={0}
                    borderBottomRightRadius={0}
                    backgroundColor={"blue"}
                />
                <View style={{ transform: 'rotate(90deg)' }}>
                    <QuarterCircle
                        size="100" mt="-2" marginTop={0}
                        width={100}
                        height={100}
                        borderTopLeftRadius={150}
                        borderTopRightRadius={0}
                        borderBottomLeftRadius={0}
                        borderBottomRightRadius={0}
                        backgroundColor={"red"}
                    />
                </View>
            </View>

            <View style={{ flexDirection: "row" }}>
            <View style={{ transform: 'rotate(270deg)' }}>
                <QuarterCircle
                    size="100" mt="-2" marginTop={0}
                    width={100}
                    height={100}
                    borderTopLeftRadius={150}
                    borderTopRightRadius={0}
                    borderBottomLeftRadius={0}
                    borderBottomRightRadius={0}
                    backgroundColor={"red"}
                />
                </View>
                <View style={{ transform: 'rotate(180deg)' }}>
                    <QuarterCircle
                        size="100" mt="-2" marginTop={0}
                        width={100}
                        height={100}
                        borderTopLeftRadius={150}
                        borderTopRightRadius={0}
                        borderBottomLeftRadius={0}
                        borderBottomRightRadius={0}
                        backgroundColor={"blue"}
                    />
                </View>
            </View>

            <View style={{ flexDirection: "row" }}>
                <QuarterCircle
                    size="100" mt="-2" marginTop={0}
                    width={75}
                    height={75}
                    borderTopLeftRadius={125}
                    borderTopRightRadius={0}
                    borderBottomLeftRadius={0}
                    borderBottomRightRadius={0}
                    backgroundColor={"blue"}
                />
                <View style={{ transform: 'rotate(90deg)' }}>
                    <QuarterCircle
                        size="100" mt="-2" marginTop={0}
                        width={75}
                        height={75}
                        borderTopLeftRadius={125}
                        borderTopRightRadius={0}
                        borderBottomLeftRadius={0}
                        borderBottomRightRadius={0}
                        backgroundColor={"red"}
                    />
                </View>
            </View>

            <View style={{ flexDirection: "row" }}>
            <View style={{ transform: 'rotate(270deg)' }}>
                <QuarterCircle
                    size="100" mt="-2" marginTop={0}
                    width={75}
                    height={75}
                    borderTopLeftRadius={125}
                    borderTopRightRadius={0}
                    borderBottomLeftRadius={0}
                    borderBottomRightRadius={0}
                    backgroundColor={"red"}
                />
                </View>
                <View style={{ transform: 'rotate(180deg)' }}>
                    <QuarterCircle
                        size="100" mt="-2" marginTop={0}
                        width={75}
                        height={75}
                        borderTopLeftRadius={125}
                        borderTopRightRadius={0}
                        borderBottomLeftRadius={0}
                        borderBottomRightRadius={0}
                        backgroundColor={"blue"}
                    />
                </View>
            </View>

            
            <View style={{ flexDirection: "row" }}>
                <QuarterCircle
                    size="100" mt="-2" marginTop={0}
                    width={50}
                    height={50}
                    borderTopLeftRadius={100}
                    borderTopRightRadius={0}
                    borderBottomLeftRadius={0}
                    borderBottomRightRadius={0}
                    backgroundColor={"blue"}
                />
                <View style={{ transform: 'rotate(90deg)' }}>
                    <QuarterCircle
                        size="100" mt="-2" marginTop={0}
                        width={50}
                        height={50}
                        borderTopLeftRadius={100}
                        borderTopRightRadius={0}
                        borderBottomLeftRadius={0}
                        borderBottomRightRadius={0}
                        backgroundColor={"red"}
                    />
                </View>
            </View>

            <View style={{ flexDirection: "row" }}>
            <View style={{ transform: 'rotate(270deg)' }}>
                <QuarterCircle
                    size="100" mt="-2" marginTop={0}
                    width={50}
                    height={50}
                    borderTopLeftRadius={100}
                    borderTopRightRadius={0}
                    borderBottomLeftRadius={0}
                    borderBottomRightRadius={0}
                    backgroundColor={"red"}
                />
                </View>
                <View style={{ transform: 'rotate(180deg)' }}>
                    <QuarterCircle
                        size="100" mt="-2" marginTop={0}
                        width={50}
                        height={50}
                        borderTopLeftRadius={100}
                        borderTopRightRadius={0}
                        borderBottomLeftRadius={0}
                        borderBottomRightRadius={0}
                        backgroundColor={"blue"}
                    />
                </View>
            </View>
        </View>

    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },
});

