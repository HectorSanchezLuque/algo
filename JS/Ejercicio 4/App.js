import { StatusBar } from 'expo-status-bar';
import { Button, StyleSheet, Text, View } from 'react-native';
import { Square, Triangle, Circle, QuarterCircle, Rectangle } from './Components/Figures';
import { useState } from "react";

/* Ejercicio 1
export default function App() {
    const [color, setColor] = useState("yellow");

    function handleOnPress(){
        if (color == "yellow")
        {
            setColor("green");
        } else{
            setColor("yellow");
        }
        
        alert("It just Works")
    }
    return (
        <View style={styles.container}>
            <View>
                <Square
                size={"200"}
                mt={"0"}
                marginTop={0}
                width={200}
                height={200}
                backgroundColor={color}
                />

            </View>
            <Button
                onPress={handleOnPress}
                title="Púlsame"
            />  
        </View>
    )}*/

/* Ejercicio 2
export default function App() {
    const [color, setColor] = useState("yellow");

    function handleOnPress() {
        if (color == "yellow") {
            setColor("green");
        } else if (color == "green") {
            setColor("red");
        } else if (color == "red"){
            setColor("yellow")
        }
    }
    return (
        <View style={styles.container}>
            <View>
                <Square
                    size={"200"}
                    mt={"0"}
                    marginTop={0}
                    width={100}
                    height={100}
                    backgroundColor={color}
                />

            </View>
            <Button
                onPress={handleOnPress}
                title="Púlsame"
            />
        </View>
    )
}*/

export default function App() {
    const [color, setColor] = useState("white");

    function handleOnPress() {
        if (color == "white") {
            setColor("black");
        } else if (color == "black") {
            setColor("white");
        } 
    }
    return (
        <View style={styles.container}>
            <View>
                <Square
                    size={"200"}
                    mt={"0"}
                    marginTop={0}
                    width={100}
                    height={100}
                    backgroundColor={color}
                />

            </View>
            <Button
                onPress={handleOnPress}
                title="Púlsame"
            />
        </View>
    )
}


const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },
});